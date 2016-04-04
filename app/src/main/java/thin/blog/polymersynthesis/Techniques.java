package thin.blog.polymersynthesis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Techniques extends AppCompatActivity {
    @Bind(R.id.app_bar)
    android.support.v7.widget.Toolbar toolbar;

    @OnClick(R.id.addition)
    public void addition() {
        startActivity(new Intent(Techniques.this, Addition.class));
    }

    @OnClick(R.id.condensation)
    public void condensation() {
        startActivity(new Intent(Techniques.this, Condensation.class));
    }

    @OnClick(R.id.coordination)
    public void coordination() {
        startActivity(new Intent(Techniques.this, Coordination.class));
    }

    @OnClick(R.id.copolymerization)
    public void copolymerisation() {
        startActivity(new Intent(Techniques.this, Copolymerisation.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techniques);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
    }

}
