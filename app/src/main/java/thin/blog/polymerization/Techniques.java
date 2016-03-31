package thin.blog.polymerization;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Techniques extends AppCompatActivity {
    @Bind(R.id.app_bar)
    android.support.v7.widget.Toolbar toolbar;

    @OnClick(R.id.bulk)
    public void bulk() {
        startActivity(new Intent(Techniques.this, Bulk.class));
    }

    @OnClick(R.id.solution)
    public void solution() {
        startActivity(new Intent(Techniques.this, Solution.class));
    }

    @OnClick(R.id.suspension)
    public void suspension() {
        startActivity(new Intent(Techniques.this, Suspension.class));
    }

    @OnClick(R.id.emulsion)
    public void emulsion() {
        startActivity(new Intent(Techniques.this, Emulsion.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techniques);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
    }
}
