import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class KeyAdapterDemo {
  
  public static void main(String[] args) {
    JFrame frame = new JFrame("Key Adapter Demo");
    JPanel panel = new JPanel();
    frame.add(panel);
    frame.setSize(300, 300);
    frame.setVisible(true);
    
    panel.setFocusable(true);
    panel.addKeyListener(new MyKeyAdapter());
  }
  
  private static class MyKeyAdapter extends KeyAdapter {
    @Override
    public void keyPressed(KeyEvent e) {
      System.out.println("Key pressed: " + e.getKeyChar());
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
      System.out.println("Key released: " + e.getKeyChar());
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
      System.out.println("Key typed: " + e.getKeyChar());
    }
  }
}
