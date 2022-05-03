package sg.edu.np.mad.mad_practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1=findViewById(R.id.displayname);
        textView1.setText(user1.name);
        TextView textView2=findViewById(R.id.displaydescription);
        textView2.setText(user1.description);
        Intent receivingEnd=getIntent();
        int randomValue=receivingEnd.getIntExtra("key",-1);
        textView1.setText(user1.name+randomValue);


    }
    User user1=new User("MAD","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident",3,false);

    public void Click(View view){
        TextView follow=findViewById(R.id.follow);
        if (user1.followed){
            follow.setText("Unfollow");
            user1.followed=false;
            Toast.makeText(MainActivity.this,"Followed", Toast.LENGTH_SHORT).show();
        }
        else{
            follow.setText("follow");
            user1.followed=true;

        }
    }
        public class User{
        String name;
        String description;
        int id;
        boolean followed;
        public User(String n,String d,int i,boolean f){
            this.name=n;
            this.description=d;
            this.id=i;
            this.followed=f;
        }

    }


}