package algonquin.cst2335.sanchitsandroidlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Main page for a simple password checker app
 * @author Sanchit
 * @version 1.0
 */
public class MainActivity extends AppCompatActivity {

    /** This holds string for password */
    private EditText et = null;

    /** This holds the button to check password validation */
    private Button btn = null;
    setContentView(R.layout.activity_main);

    TextView tv = findViewById(R.id.textView);
    EditText et = findViewById(R.id.editText);
    Button btn = findViewById(R.id.button);

        btn.setOnClickListener(clk ->{
        String password = et.getText().toString();

        checkPasswordComplexity(password);
    )};
}

    /**
     * This function checks if the string fulfills all requirements of a valid password.
     * @param pw The string object that we checking
     * @return Returns true if the string matches all requirements
     */
    boolean checkPasswordComplexity(String pw) {
        boolean foundUpperCase, foundLowerCase, foundNumber, foundSpecial;
        foundUpperCase = foundLowerCase = foundNumber = foundSpecial = false;

        char[] ch = pw.toCharArray();
        TextView tv = findViewById(R.id.textView);

        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])) {
                foundNumber = true;
            }
            if (Character.isUpperCase(ch[i])) {
                foundUpperCase = true;
            }
        }

        /**
         * This function checks if any character in the password matches with any special character or not
         * @param ch The character of the string we are checking
         * @return Returns true if the character matches with any special character
         */
        boolean isSpecialCharacter(char ch) {
            switch (ch){
                case '#':
                case '?':
                case '*':
                case '!':
                case '%':
                case '^':
                case '@':
                case '$':
                case '&':
                    return true;
                default:
                    return false;
            }
        }
    }
}