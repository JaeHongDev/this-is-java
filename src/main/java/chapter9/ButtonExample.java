package chapter9;
public class ButtonExample {
    public static void main(String[] args){
        Button btnOk = new Button();

        class OkListener implements Button.ClickListener{
            @Override
            public void onClick() {
                System.out.println("click btn");
            }
        }

        btnOk.setClickListener(new OkListener());

        Button btnCancel = new Button();

        class CancelListener implements Button.ClickListener{

            @Override
            public void onClick() {
                System.out.println("Cancel button");
            }
        }

        btnCancel.setClickListener(new CancelListener());
        btnCancel.setClickListener(new Button.ClickListener(){
            @Override
            public void onClick(){
                System.out.println("클릭");
            }
        });
        btnCancel.click();
    }
}
