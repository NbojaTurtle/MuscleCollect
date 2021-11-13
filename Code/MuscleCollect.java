package Code;
import javax.swing.JFrame;

public class MuscleCollect extends JFrame{
    public MuscleCollect(){
        add(new GamePlay());
        setTitle("MuscleCollect");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(380,430);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
