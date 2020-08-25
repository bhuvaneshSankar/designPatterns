//component -> the parent interface of composite and leafs
public interface IComponent {
    public void play();

    public void setPlayBackSpeed(float speed);

    public String getName();
}