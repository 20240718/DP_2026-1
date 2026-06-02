package practice.ch14;

//트러블 해결자
public abstract class Support {
    private String name;    // 이 트러블 해결자 이름
    private Support next;   // 떠넘길 곳(support: 부모 타입-> 모든 종류의 해결자를 가리킬 수 있다)

    public Support(String name) {
        this.name = name;
        this.next = null;
    }

    // 떠넘길 곳을 설정한다
    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    // 트러블 해결 절차를 결정한다
    public void support(Trouble trouble) {
        if (resolve(trouble)) { // 해결할 수 있으면 해결한다
            done(trouble);
        } else if (next != null) { // 자신이 해결 못했는데 떠넘길 곳이 있으면 떠넘긴다
            next.support(trouble);
        } else { // 떠넘길 곳도 없으면 해결 실패
            fail(trouble);
        }
    }

    // 트러블 해결자의 문자열 표현
    @Override
    public String toString() {
        return "[" + name + "]";
    }

    // 해결하려고 한다 (추상 메소드)
    protected abstract boolean resolve(Trouble trouble);

    // 해결했다 
    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    // 해결되지 않았다 
    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}
