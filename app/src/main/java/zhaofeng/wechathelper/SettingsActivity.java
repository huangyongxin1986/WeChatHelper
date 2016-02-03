package zhaofeng.wechathelper;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import zhaofeng.wechathelper.fragment.SettingsFragment;

public class SettingsActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        setTitle(R.string.main_menu_setting);
        if(savedInstanceState==null)
        {
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            transaction.add(R.id.container, new SettingsFragment());
            transaction.commitAllowingStateLoss();
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        if(!super.onSupportNavigateUp()) {
            supportFinishAfterTransition();
            return true;
        }
        return false;
    }
}