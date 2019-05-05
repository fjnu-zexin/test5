# 实验报告5

关键代码：
···
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.layout);
                Button button=(Button) findViewById(R.id.btn_browse);
                final EditText editurl=(EditText) findViewById(R.id.edit_url);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent();
                        intent.setAction("android.intent.action.VIEW");
                        intent.setData(Uri.parse(editurl.getText().toString()));
                        startActivity(intent);
                    }
                });
            }




截图：  

![Image](https://github.com/fjnu-zexin/test1/blob/master/img/t4p1.PNG)
