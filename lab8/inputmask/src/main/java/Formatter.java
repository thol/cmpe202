
public abstract class Formatter implements IDisplayComponent, IKeyEventHandler {

    public IDisplayComponent formatCard;

    public Formatter(IDisplayComponent formatCard) {
        this.formatCard = formatCard;
    }

    public void setNext(IKeyEventHandler next) {
        return;
    }

    public String display() {
        return formatCard.display();
    }

    public void key(String ch, int cnt) {
        return;
    }

    public void addSubComponent(IDisplayComponent c) {
        return; // do nothing
    }
}
