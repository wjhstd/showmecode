package cn.a52going.coderpc.session;

public class RequestSessionLocal {
    private static ThreadLocal<LoginSession> sessionLocal = new ThreadLocal();

    public RequestSessionLocal() {
    }

    public static void setSession(LoginSession session) {
        sessionLocal.set(session);
    }

    public static LoginSession getSession() {
        return (LoginSession)sessionLocal.get();
    }
}
