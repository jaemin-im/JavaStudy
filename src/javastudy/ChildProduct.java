package javastudy;

/**
 * Created by dsm2017 on 2017-06-15.
 */
public class ChildProduct<T, M, C> extends Product<T, M> {
    private C company;
    public C getCompany() { return this.company; }
    public void setCompany(C company) { this.company = company; }
}
