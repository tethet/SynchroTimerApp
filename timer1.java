package tethe.java_project.timer1;

// パッケージとは入れ物であり、このコードはtethe.java_project.timer1に属している
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SynchroTimerApp extends JFrame {
  private List<TimerData> timerDataList;

  public SynchroTimerApp() {
        // ウィンドウの設定
        setTitle("シンクロタイマー");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ウィンドウが閉じられた時にアプリを終了するようにする
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)); 
        //レイアウトの配置をここで決めているgetContentPane()の括弧はメソッドの呼び出し
        //                                getContentPane;だと＝の左側に代入になってしまう



         // ウィンドウを常に最前面に表示
        setAlwaysOnTop(true);
        // タイマーパネルのリストを初期化
        timerPanels = new ArrayList<>();

         // ボタンの追加
        JButton addButton = new JButton("新しいタイマー追加");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTimerPanel();
            }
        });
        add(addButton);
      }
