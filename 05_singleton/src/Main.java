public class Main {
  public static void main(String[] args) {
    SystemSpeaker speaker1 = SystemSpeaker.getInstance();
    SystemSpeaker speaker2 = SystemSpeaker.getInstance();

    System.out.println(speaker2.getVolume());
    System.out.println(speaker1.getVolume());

    speaker2.setVolume(11);
    System.out.println(speaker2.getVolume());
    System.out.println(speaker1.getVolume());
  }
}
