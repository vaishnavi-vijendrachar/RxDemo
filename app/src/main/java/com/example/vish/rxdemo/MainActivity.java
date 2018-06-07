package com.example.vish.rxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

import static junit.framework.Assert.assertTrue;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Observable<Integer> observable = Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
                e.onNext(1);
                e.onNext(2);
                e.onNext(3);
                e.onNext(4);
                e.onComplete();

            }
        });

        Observer<Integer> observer = new Observer<Integer>(){

            @Override
            public void onSubscribe(Disposable d) {
                Log.e("dsvchdcv", "onSubscribe: ");
            }

            @Override
            public void onNext(Integer integer) {
                Log.e("dsvchdcv", "onNext: " + integer);
            }

            @Override
            public void onError(Throwable e) {
                Log.e("ewjhj", "onError: ");
            }

            @Override
            public void onComplete() {
                Log.e("ewjhj", "onComplete: ");
            }
        };

        observable.subscribe(observer);

        Integer.parseInt("wedfjkewhk0");




    }
}
