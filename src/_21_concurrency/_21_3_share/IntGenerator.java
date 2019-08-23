package _21_concurrency._21_3_share;

/**
 * @Author wx-li
 * @Date 2019/8/21 13:54
 **/
public abstract class IntGenerator {
    private volatile boolean canceled = false;
    public abstract int next();
    //Allow this to be canceled
    public void cancel(){canceled = true; }
    public boolean isCanceled(){return canceled; }
}
