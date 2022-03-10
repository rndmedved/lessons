package lessons.singleton;

/*
Реализуем Синглтон с синхронизацией.
*/

public class Singleton {
    private static Singleton singleton;
    private Singleton(){           //Закрываем конструктор по умолчанию
        singleton = null;
    }
    public static Singleton getSingleton() {
        synchronized (Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
