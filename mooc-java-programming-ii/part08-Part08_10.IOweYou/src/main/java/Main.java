
public class Main {

    public static void main(String[] args) {
        IOU iou = new IOU();
        iou.setSum("Mark", 10);
        iou.setSum("Tom", 55.1);
        iou.setSum("Mark", 49.2);
        
        System.out.println(iou.howMuchDoIOweTo("Mark"));
        System.out.println(iou.howMuchDoIOweTo("Tom"));
    }
}
