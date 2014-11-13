package gr.vanderbox.roundedletterview_sampleapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import gr.vanderbox.roundedletterview_sampleapp.adapter.SampleAdapter;


public class MainActivity extends Activity {

    private ListView mListView;
    private SampleAdapter mAdapter;
    private ArrayList<String> mRandomData = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getActionBar().setElevation(4);

        getDummyData();

        this.mListView = (ListView) findViewById(R.id.lv_sample_list);
        this.mAdapter = new SampleAdapter(this,mRandomData);
        this.mListView.setAdapter(mAdapter);
    }

    private void getDummyData(){
        this.mRandomData.add("Aaaaaaaaaaaaaaaa");
        this.mRandomData.add("Bbbbbbbbbbbbbbb");
        this.mRandomData.add("Cccccccccccccccc");
        this.mRandomData.add("Ddddddddddddddd");
        this.mRandomData.add("Eeeeeeeeeeeeeeee");
        this.mRandomData.add("Ffffffffffffffff");
        this.mRandomData.add("Ggggggggggggggg");
        this.mRandomData.add("Hhhhhhhhhhhhhhh");
        this.mRandomData.add("Iiiiiiiiiiiiiiii");
        this.mRandomData.add("Jjjjjjjjjjjjjjjj");
        this.mRandomData.add("Kkkkkkkkkkkkkkkk");
        this.mRandomData.add("Llllllllllllllll");
        this.mRandomData.add("Mmmmmmmmmm");
        this.mRandomData.add("Nnnnnnnnnnnnnnnn");
        this.mRandomData.add("Ooooooooooooooo");
        this.mRandomData.add("Ppppppppppppppp");
        this.mRandomData.add("Qqqqqqqqqqqqqqq");
        this.mRandomData.add("Rrrrrrrrrrrrrrrr");
        this.mRandomData.add("Ssssssssssssssss");
        this.mRandomData.add("Tttttttttttttttt");
        this.mRandomData.add("Uuuuuuuuuuuuuuu");
        this.mRandomData.add("Vvvvvvvvvvvvvvvv");
        this.mRandomData.add("Wwwwwwwwwww");
        this.mRandomData.add("Yyyyyyyyyyyyyyyy");
        this.mRandomData.add("Zzzzzzzzzzzzzzzz");
        this.mRandomData.add("Aaaaaaaaaaaaaaaa");
        this.mRandomData.add("Bbbbbbbbbbbbbbb");
        this.mRandomData.add("Cccccccccccccccc");
        this.mRandomData.add("Ddddddddddddddd");
        this.mRandomData.add("Eeeeeeeeeeeeeeee");
        this.mRandomData.add("Ffffffffffffffff");
        this.mRandomData.add("Ggggggggggggggg");
        this.mRandomData.add("Hhhhhhhhhhhhhhh");
        this.mRandomData.add("Iiiiiiiiiiiiiiii");
        this.mRandomData.add("Jjjjjjjjjjjjjjjj");
        this.mRandomData.add("Kkkkkkkkkkkkkkkk");
        this.mRandomData.add("Llllllllllllllll");
        this.mRandomData.add("Mmmmmmmmmm");
        this.mRandomData.add("Nnnnnnnnnnnnnnnn");
        this.mRandomData.add("Ooooooooooooooo");
        this.mRandomData.add("Ppppppppppppppp");
        this.mRandomData.add("Qqqqqqqqqqqqqqq");
        this.mRandomData.add("Rrrrrrrrrrrrrrrr");
        this.mRandomData.add("Ssssssssssssssss");
        this.mRandomData.add("Tttttttttttttttt");
        this.mRandomData.add("Uuuuuuuuuuuuuuu");
        this.mRandomData.add("Vvvvvvvvvvvvvvvv");
        this.mRandomData.add("Wwwwwwwwwww");
        this.mRandomData.add("Yyyyyyyyyyyyyyyy");
        this.mRandomData.add("Zzzzzzzzzzzzzzzz");
        this.mRandomData.add("Aaaaaaaaaaaaaaaa");
        this.mRandomData.add("Bbbbbbbbbbbbbbb");
        this.mRandomData.add("Cccccccccccccccc");
        this.mRandomData.add("Ddddddddddddddd");
        this.mRandomData.add("Eeeeeeeeeeeeeeee");
        this.mRandomData.add("Ffffffffffffffff");
        this.mRandomData.add("Ggggggggggggggg");
        this.mRandomData.add("Hhhhhhhhhhhhhhh");
        this.mRandomData.add("Iiiiiiiiiiiiiiii");
        this.mRandomData.add("Jjjjjjjjjjjjjjjj");
        this.mRandomData.add("Kkkkkkkkkkkkkkkk");
        this.mRandomData.add("Llllllllllllllll");
        this.mRandomData.add("Mmmmmmmmmm");
        this.mRandomData.add("Nnnnnnnnnnnnnnnn");
        this.mRandomData.add("Ooooooooooooooo");
        this.mRandomData.add("Ppppppppppppppp");
        this.mRandomData.add("Qqqqqqqqqqqqqqq");
        this.mRandomData.add("Rrrrrrrrrrrrrrrr");
        this.mRandomData.add("Ssssssssssssssss");
        this.mRandomData.add("Tttttttttttttttt");
        this.mRandomData.add("Uuuuuuuuuuuuuuu");
        this.mRandomData.add("Vvvvvvvvvvvvvvvv");
        this.mRandomData.add("Wwwwwwwwwww");
        this.mRandomData.add("Yyyyyyyyyyyyyyyy");
        this.mRandomData.add("Zzzzzzzzzzzzzzzz");
    }
}
