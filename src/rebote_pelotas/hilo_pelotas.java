package rebote_pelotas;

import javax.swing.JLabel;

public class hilo_pelotas extends Thread {

    private JLabel lbl_p;
    private frame_pelotas fp;

    public hilo_pelotas(JLabel eti, frame_pelotas p) { //Constructor
        this.lbl_p = eti;
        this.fp = p;
    }

    public void run() { // se reescribe el metodo run de Thread

        int y_p1;
        int m = 5;
       

        while (true) {
            try {

                sleep((int) (Math.random() * 50));
                y_p1 = lbl_p.getLocation().y;

                if (y_p1 <= 272) {
                    lbl_p.setLocation(lbl_p.getLocation().x, lbl_p.getLocation().y + m);
                    fp.repaint();

                }
                if (y_p1 == 265) {
                    m = -5;
                }
                if (y_p1 == 0) {
                    m = 5;
                }
            } catch (InterruptedException e) {
            }

        }

    }

}
