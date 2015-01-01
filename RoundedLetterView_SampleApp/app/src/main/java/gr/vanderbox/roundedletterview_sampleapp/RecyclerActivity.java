package gr.vanderbox.roundedletterview_sampleapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import gr.vanderbox.roundedletterview_sampleapp.view.RoundedLetterView;


public class RecyclerActivity extends Activity{

    RecyclerView mRecyclerView;
    LinearLayoutManager mLayoutManager;

    private ArrayList<String> mRandomData = new ArrayList<String>();

    private Context mContext;

    private int previousPosition,nextPosition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        getDummyData();
        mContext = this;

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mRecyclerView.setAdapter(new RecyclerView.Adapter<InternViewHolder>() {
            @Override
            public InternViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View itemView = LayoutInflater.from(mContext).inflate(R.layout.layout_list_view_item,null);
                return new InternViewHolder(itemView);
            }

            @Override
            public void onBindViewHolder(InternViewHolder viewHolder, int i) {
                if(mRandomData.get(i).length() == 0){
                    viewHolder.mRoundedLetterView.setTitleText("A");
                }else{
                    viewHolder.mRoundedLetterView.setTitleText(mRandomData.get(i).substring(0,1).toUpperCase());
                }
                if(i%2 == 0){
                    viewHolder.mRoundedLetterView.setBackgroundColor(mContext.getResources().getColor(R.color.green));
                }else{
                    viewHolder.mRoundedLetterView.setBackgroundColor(mContext.getResources().getColor(R.color.red));
                }
                viewHolder.mFileNameTextView.setText(mRandomData.get(i));
            }

            @Override
            public int getItemCount() {
                return mRandomData.size();
            }


        });



    }

    final class InternViewHolder
            extends RecyclerView.ViewHolder {
        private TextView mFileNameTextView;
        public RoundedLetterView mRoundedLetterView;
        public InternViewHolder(final View itemView) {
            super(itemView);
            mRoundedLetterView = (RoundedLetterView) itemView.findViewById(R.id.rlv_name_view);
            mFileNameTextView = (TextView) itemView.findViewById(R.id.tv_name_holder);
            mRoundedLetterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = mRecyclerView.getChildPosition(itemView);
                    mLayoutManager.moveView(position,0);
                    mLayoutManager.scrollToPosition(0);
                    mRecyclerView.getAdapter().notifyItemMoved(position,0);
                }
            });

//            mRoundedLetterView.setOnLongClickListener(new View.OnLongClickListener() {
//                @Override
//                public boolean onLongClick(View v) {
//                    int position = mRecyclerView.getChildPosition(itemView);
//                    Toast.makeText(mContext,"Position long-click: " + position,Toast.LENGTH_SHORT).show();
//                    mLayoutManager.detachViewAt(position);
//                    mLayoutManager.attachView(itemView,0);
//                    mRecyclerView.getAdapter().notifyItemMoved(position,0);
//                    return true;
//                }
//            });
//
//            mRoundedLetterView.setOnDragListener(new View.OnDragListener() {
//                @Override
//                public boolean onDrag(View v, DragEvent event) {
//
//                    switch(event.getAction()){
//                        case MotionEvent.ACTION_DOWN:
//                            Rect rect = new Rect();
//                            int[] recyclerViewcoords = new int[2];
//                            mRecyclerView.getLocationOnScreen(recyclerViewcoords);
//                            int x = (int) event.getX() - recyclerViewcoords[0];
//                            int y = (int) event.getY() - recyclerViewcoords[1];
//                            View child,toMove = null;
//                            for(int i=0;i<mRecyclerView.getChildCount();i++){
//                                child = mRecyclerView.getChildAt(i);
//                                child.getHitRect(rect);
//                                if(rect.contains(x,y)){
//                                    toMove = child;
//                                    break;
//                                }
//                            }
//                            if(toMove != null){
//                                previousPosition = mRecyclerView.getChildPosition(toMove);
//                                Toast.makeText(mContext,"Position pre: " + previousPosition,Toast.LENGTH_SHORT).show();
//                            }
//                            break;
//                        case MotionEvent.ACTION_UP:
//                            Rect rectUp = new Rect();
//                            int[] recyclerCoords = new int[2];
//                            mRecyclerView.getLocationOnScreen(recyclerCoords);
//                            int xUp = (int) event.getX() - recyclerCoords[0];
//                            int yUp = (int) event.getY() - recyclerCoords[1];
//                            View childUp,toMoveUp = null;
//                            for(int i=0;i<mRecyclerView.getChildCount();i++){
//                                childUp = mRecyclerView.getChildAt(i);
//                                childUp.getHitRect(rectUp);
//                                if(rectUp.contains(xUp,yUp)){
//                                    toMoveUp = childUp;
//                                    break;
//                                }
//                            }
//                            if(toMoveUp != null){
//                                nextPosition = mRecyclerView.getChildPosition(toMoveUp);
//                                Toast.makeText(mContext,"Position next: " + nextPosition,Toast.LENGTH_SHORT).show();
//                                mLayoutManager.moveView(previousPosition,nextPosition);
//                                mLayoutManager.scrollToPosition(nextPosition);
//                                mRecyclerView.getAdapter().notifyItemMoved(previousPosition,nextPosition);
//                            }
//
//                            break;
//
//                    }
//
//                    return true;
//                }
//            });
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_recycler, menu);
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
