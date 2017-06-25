package application.view;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class MainViewCintroller {

	@FXML
	private Label label;
	
	@FXML
	private Button btn;
	
	@FXML
	private TextArea textArea;
	
	
	public MainViewCintroller() {
		// TODO Auto-generated constructor stub
	}
	
	
	@FXML
	private void initialize() {
		System.out.println("initialize");
		textArea.setText("The.Tao gave birth to machine language. Machine language gave birth\r\n"
				+ "to the assembler. The assembler gave birth to the compiler. Now there are ten thousand\r\n"
				+ "languages. Each language has its purpose, however humble. Each language\r\n"
				+ "expresses the Yin and Yang of software. Each language has its place within\r\n"
				+ "the Tao.\r\n"
				+ "But do not program in COBOL if you can avoid it.\r\n"
				+ "-- Geoffrey James, \"The Tao of Programming\"");
	}
	
	
	@FXML
	private void handleOnClick() {	
		String inputText = textArea.getText();
		String []arrayOfWords = inputText.split("\\W+");
		
		String arrayOfChar = "";
		
		for (int i = 0; i < arrayOfWords.length; i++) {
			arrayOfWords[i] = arrayOfWords[i].replaceAll("[^\\w]", "");
			arrayOfChar = arrayOfChar + getUniqueChar(arrayOfWords[i]);
		}
		
		String result = "" + getUniqueChar(arrayOfChar);
		
		label.setText(result);
 	}
	
	private String getUniqueChar (String str) {
		String resalt = "";
		
		for (int i = 0; i < str.length(); i++) {
			int counter = 1;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j) && (i != j))
					counter++;	
			}
			
			if (counter == 1) {
				resalt += str.charAt(i);
				break;
			}
	    }
		
		return resalt;	
	}
}
