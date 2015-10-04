package wynsean.courseadviser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    List<String> courses = new ArrayList<String>();

    public void onClickFindCourse(View view){

        //Get a reference to the Spinner
        Spinner spinner = (Spinner) findViewById(R.id.spinner_terms);

        //Get a reference to the TextView
        TextView courses = (TextView) findViewById(R.id.tv_courses);

        //Get the selected item in the Spinner
        String term = String.valueOf(spinner.getSelectedItem());

        //Get recommendations from the Course Checklist
        List<String> courseList = getCourses(term);

        //Format string list
        StringBuilder coursesFormatted = new StringBuilder();

        for (String course: courseList)
            coursesFormatted.append(course).append('\n');

        //Display the selected item
        courses.setText(coursesFormatted);
    }

    public List<String> getCourses(String term) {

        List<String> courses = new ArrayList<String>();

        if (term.equals("1st term")) {
            courses.add("NSTP101");
            courses.add("PERSEF1");
            courses.add("LASARE1");
            courses.add("FITWELL");
            courses.add("ENGALG1");
            courses.add("ENGTRIG");
            courses.add("ENGLCOM");
            courses.add("FILKOMU");
            courses.add("TREDONE");
            courses.add("GRAPONE");
        }

        else if (term.equals("2nd term")) {
            courses.add("NSTP-R1/C1");
            courses.add("FTSPORT");
            courses.add("ANAGEOM");
            courses.add("SOLIMEN");
            courses.add("DIFFCAL");
            courses.add("ENGLRES");
            courses.add("FILDLAR");
            courses.add("CHEMONE");
            courses.add("LBYCH11");
        }
        else if (term.equals("3rd term")) {
            courses.add("SAS1000");
            courses.add("NSTP-R2/C2");
            courses.add("FTDANCE");
            courses.add("INTECAL");
            courses.add("ENGALG2");
            courses.add("SPEECOM");
            courses.add("SOCTEC1");
            courses.add("LBYMEEA");
            courses.add("ENGPHY1");
            courses.add("LPYPH11");
        }
        else if (term.equals("4th term")) {
            courses.add("HUMALIT");
            courses.add("KASPIL1");
            courses.add("STATICS");
            courses.add("ENGIANA");
            courses.add("ENGPHY2");
            courses.add("LBYPH12");
            courses.add("FTTEAMS");
            courses.add("LBYEC71");
        }
        else if (term.equals("5th term")) {
            courses.add("HUMAART");
            courses.add("TREDTWO");
            courses.add("DYNAMIC");
            courses.add("ENGSTAT");
            courses.add("DISMATH");
            courses.add("ELCIAN1");
            courses.add("LBYEC11");
            courses.add("LBYEC72");
            courses.add("LASARE2");
        }
        else { // 6th term
            courses.add("MEDEFOR");
            courses.add("ENVIRON");
            courses.add("CONTSIG");
            courses.add("VECANAL");
            courses.add("ELCIAN2");
            courses.add("LBYEC12");
            courses.add("ELETRO1");
            courses.add("LBYEC13");
        }
        return courses;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
