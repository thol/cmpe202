

public class CardNumFormat extends Formatter {

    private IKeyEventHandler nextHandler;
    private IDisplayComponent formatCard;
    private String number = "";

    public CardNumFormat(IDisplayComponent formatCard) {
        super(formatCard);
    }

    public void setNext(IKeyEventHandler next) {
        this.nextHandler = next;
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        if (number.length() > 16 ) number = number.substring(0,15);
        int len = number.length();
        if (number.equals(""))
            return "[4444 4444 4444 4444]" + "  ";
        else {

            switch (len) {
                case 1:
                case 2:
                case 3:
                    sb.append(number.substring(0,len));
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    sb.append(number.substring(0,3));
                    sb.append(" ");
                    sb.append(number.substring(4,len));
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                    sb.append(number.substring(0,3));
                    sb.append(" ");
                    sb.append(number.substring(4,7));
                    sb.append(" ");
                    sb.append(number.substring(8,len));
                    break;
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    sb.append(number.substring(0,3));
                    sb.append(" ");
                    sb.append(number.substring(4,7));
                    sb.append(" ");
                    sb.append(number.substring(8,11));
                    sb.append(" ");
                    sb.append(number.substring(12,len));
                    break;
                default:
                    break;
            }
            return "[" + sb.toString() + "]" + "  ";
        }
    }

    public void key(String ch, int cnt) {
        return;
    }

    public void addSubComponent(IDisplayComponent c) {
        return; // do no
    }
}
