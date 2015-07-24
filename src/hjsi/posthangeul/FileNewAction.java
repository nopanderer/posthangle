package hjsi.posthangeul;

import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.JEditorPane;
import javax.swing.text.StyledEditorKit.StyledTextAction;

import hjsi.posthangeul.window.PostHangeulApp;

public class FileNewAction extends StyledTextAction {
  private static final long serialVersionUID = 620247404113872945L;

  PostHangeulApp app;

  public FileNewAction(PostHangeulApp app) {
    super("file-new");
    this.app = app;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    JEditorPane editor = getEditor(e);

    app.setCurrentFile(new File("제목 없음.txt"));
    editor.setText(null);

    editor.requestFocus();
  }
}
