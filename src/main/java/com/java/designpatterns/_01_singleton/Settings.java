package com.java.designpatterns._01_singleton;

public class Settings {

    //private static Settings instance;

    //private 생성자를 만들면 밖에서 인스턴스 생성 불가
    private Settings(){}

    //1. 글로벌하게 접근할 수 있도록 get메서드 생성 -> 멀티쓰레드에 안전하지 못한 방법임
//    public static Settings getInstance(){
//
//        if(instance == null ){
//            return new Settings();
//        }
//
//        return instance;
//    }


    //2. synchronized 키워드 사용 -> 멀티쓰레드에 안전하지만, 성능저하
//    public static synchronized Settings getInstance(){
//
//        if(instance == null ){
//            return new Settings();
//        }
//
//        return instance;
//    }


    // 3. 이른 초기화
    // private static final Settings INSTANCE = new Settings();


    // 4. double checked locking
//    private static volatile Settings instance;
//
//    public static Settings getInstance(){
//        if(instance == null){
//            synchronized (Settings.class){
//                if(instance == null){
//                    instance = new Settings();
//                }
//            }
//        }
//
//        return instance;
//    }

    // 5. static inner 클래스 사용
    private static class SettingsHolder{
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance(){
        return SettingsHolder.INSTANCE;
    }

}
