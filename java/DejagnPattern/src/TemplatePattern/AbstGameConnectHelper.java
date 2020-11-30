package TemplatePattern;

public abstract class AbstGameConnectHelper {

    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    //템플릿 메소드
    public String requestConnection(String encodedInfo) {
        String decodedInfo = doSecurity(encodedInfo);
        String id = "aaa";
        String password = "bbb";
        if (!authentication(id, password)) {
            throw new Error("불일치");
        }
        String userName = "userName";
        int i = authorization(userName);
        switch (i) {
            case 0: //게임매니저
                break;
            case 1: //유료 회원
                break;
            case 2: //무료 회원
                break;
            case 3: //권한 없음
            default: //기타상황
                break;
        }
        return connection(decodedInfo);
    }
}
