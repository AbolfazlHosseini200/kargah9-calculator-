package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.event.ActionEvent;

import java.util.ArrayList;

public class Controller {
    public String textOnShow = "";
    public ArrayList<String> nums = new ArrayList<String>();
    public String signs = "+";
    public double numSign=1;
    public boolean lastWasNum = false,oneNumberNeeded=false;
    @FXML
    public TextArea show;

    @FXML
    public Button one;

    @FXML
    public Button log;


    @FXML
    public Button two;
    @FXML
    public Button three;
    @FXML
    public Button four;
    @FXML
    public Button five;
    @FXML
    public Button six;
    @FXML
    public Button seven;
    @FXML
    public Button eight;
    @FXML
    public Button nine;
    @FXML
    public Button zero;
    @FXML
    public Button division;
    @FXML
    public Button multiply;
    @FXML
    public Button minus;
    @FXML
    public Button sum;
    @FXML
    public Button radical;
    @FXML
    public Button equal;
    @FXML
    public Button tan;
    @FXML
    public Button sin;
    @FXML
    public Button cos;
    @FXML
    public Button cot;
    @FXML
    public Button power;
    @FXML
    public Button sign;
    @FXML
    public Button dot;
    @FXML
    public Button ac;
    @FXML
    public Button ln;


    @FXML
    public void f1(ActionEvent e) {
        if (lastWasNum) {
            String temp = nums.get(nums.size() - 1) + "1";
            nums.remove(nums.size() - 1);
            nums.add(temp);
        } else
            nums.add("1");
        lastWasNum = true;
        textOnShow = textOnShow + "1";
        show.setText(textOnShow);
    }

    @FXML
    public void f2(ActionEvent e) {
        if (lastWasNum) {
            String temp = nums.get(nums.size() - 1) + "2";
            nums.remove(nums.size() - 1);
            nums.add(temp);
        } else
            nums.add("2");
        lastWasNum = true;
        textOnShow = textOnShow + "2";
        show.setText(textOnShow);
    }

    @FXML
    public void f3(ActionEvent e) {
        if (lastWasNum) {
            String temp = nums.get(nums.size() - 1) + "3";
            nums.remove(nums.size() - 1);
            nums.add(temp);
        } else
            nums.add("3");
        lastWasNum = true;
        textOnShow = textOnShow + "3";
        show.setText(textOnShow);
    }

    @FXML
    public void f4(ActionEvent e) {
        if (lastWasNum) {
            String temp = nums.get(nums.size() - 1) + "4";
            nums.remove(nums.size() - 1);
            nums.add(temp);
        } else
            nums.add("4");
        lastWasNum = true;
        textOnShow = textOnShow + "4";
        show.setText(textOnShow);
    }

    @FXML
    public void f5(ActionEvent e) {
        if (lastWasNum) {
            String temp = nums.get(nums.size() - 1) + "5";
            nums.remove(nums.size() - 1);
            nums.add(temp);
        } else
            nums.add("5");
        lastWasNum = true;
        textOnShow = textOnShow + "5";
        show.setText(textOnShow);
    }

    @FXML
    public void f6(ActionEvent e) {
        if (lastWasNum) {
            String temp = nums.get(nums.size() - 1) + "6";
            nums.remove(nums.size() - 1);
            nums.add(temp);
        } else
            nums.add("6");
        lastWasNum = true;
        textOnShow = textOnShow + "6";
        show.setText(textOnShow);
    }

    @FXML
    public void f7(ActionEvent e) {
        if (lastWasNum) {
            String temp = nums.get(nums.size() - 1) + "7";
            nums.remove(nums.size() - 1);
            nums.add(temp);
        } else
            nums.add("7");
        lastWasNum = true;
        textOnShow = textOnShow + "7";
        show.setText(textOnShow);
    }

    @FXML
    public void f8(ActionEvent e) {
        if (lastWasNum) {
            String temp = nums.get(nums.size() - 1) + "8";
            nums.remove(nums.size() - 1);
            nums.add(temp);
        } else
            nums.add("8");
        lastWasNum = true;
        textOnShow = textOnShow + "8";
        show.setText(textOnShow);
    }

    @FXML
    public void f9(ActionEvent e) {
        if (lastWasNum) {
            String temp = nums.get(nums.size() - 1) + "9";
            nums.remove(nums.size() - 1);
            nums.add(temp);
        } else
            nums.add("9");
        lastWasNum = true;
        textOnShow = textOnShow + "9";
        show.setText(textOnShow);
    }

    @FXML
    public void f0(ActionEvent e) {
        if (lastWasNum) {
            String temp = nums.get(nums.size() - 1) + "0";
            nums.remove(nums.size() - 1);
            nums.add(temp);
        } else
            nums.add("0");
        lastWasNum = true;
        textOnShow = textOnShow + "0";
        show.setText(textOnShow);
    }

    @FXML
    public void fSum(ActionEvent e) {
        setSign();
        if(oneNumberNeeded)
        {
            oneNumberNeeded=false;
            calculateOne();
        }
        if(!lastWasNum)
            error();
        lastWasNum=false;
        if(!signs.equals("+"))
            calculate();
        signs="+";
        textOnShow = textOnShow + "+";
        show.setText(textOnShow);
    }



    @FXML
    public void fMinus(ActionEvent e) {
        setSign();
        if(oneNumberNeeded)
        {
            oneNumberNeeded=false;
            calculateOne();
        }
        if(!lastWasNum)
            error();
        if(!signs.equals("+"))
            calculate();
        lastWasNum=false;
        signs="-";
        textOnShow = textOnShow + "-";
        show.setText(textOnShow);
    }

    @FXML
    public void fEqual(ActionEvent e) {
        setSign();
        textOnShow ="=";
        show.setText(textOnShow);
        if(oneNumberNeeded)
        {
            calculateOne();
            signs="+";
        }
        if(!signs.equals("+"))
            calculate();
        //nums.clear();
        signs="+";
        calculateAnswer();
    }



    @FXML
    public void fSign(ActionEvent e) {
        if(oneNumberNeeded)
        {
            oneNumberNeeded=false;
            calculateOne();
        }
        textOnShow = textOnShow + "-";
        show.setText(textOnShow);
        if(lastWasNum)
            error();
        numSign*=-1;
    }

    @FXML
    public void fRadical(ActionEvent e) {
        if(lastWasNum)
            error();
        oneNumberNeeded=true;
        signs="√";
        textOnShow = textOnShow + "√";
        show.setText(textOnShow);
    }

    @FXML
    public void fDot(ActionEvent e) {
        if(lastWasNum)
            if(nums.get(nums.size()-1).contains("."))
                error();
        if(!lastWasNum)
            nums.add("0.");
        else
        {
            String temp = nums.get(nums.size() - 1) + ".";
            nums.remove(nums.size() - 1);
            nums.add(temp);
        }
        textOnShow = textOnShow + ".";
        show.setText(textOnShow);
    }

    @FXML
    public void fDivide(ActionEvent e) {
        setSign();
        if(oneNumberNeeded)
        {
            oneNumberNeeded=false;
            calculateOne();
        }
        if(!lastWasNum)
            error();
        if(!signs.equals("+"))
            calculate();
        lastWasNum=false;
        signs="÷";
        textOnShow = textOnShow + "÷";
        show.setText(textOnShow);
    }

    @FXML
    public void fTan(ActionEvent e) {
        setSign();
        oneNumberNeeded=true;
        if(lastWasNum)
            error();
        signs="tan";
        textOnShow = textOnShow + "tan";
        show.setText(textOnShow);
    }

    @FXML
    public void fSin(ActionEvent e) {
        setSign();
        oneNumberNeeded=true;
        if(lastWasNum)
            error();
        signs="sin";
        textOnShow = textOnShow + "sin";
        show.setText(textOnShow);
    }

    @FXML
    public void fCos(ActionEvent e) {
        setSign();
        oneNumberNeeded=true;
        if(lastWasNum)
            error();
        signs="cos";
        textOnShow = textOnShow + "cos";
        show.setText(textOnShow);
    }

    @FXML
    public void fLog(ActionEvent e) {
        setSign();
        oneNumberNeeded=true;
        if(lastWasNum)
            error();
        signs="Log";
        textOnShow = textOnShow + "Log";
        show.setText(textOnShow);
    }

    @FXML
    public void fPower(ActionEvent e) {
        setSign();
        if(oneNumberNeeded)
        {
            oneNumberNeeded=false;
            calculateOne();
        }
        if(!lastWasNum)
            error();
        lastWasNum=false;
        if(!signs.equals("+"))
            calculate();
        signs="^";
        textOnShow = textOnShow + "^";
        show.setText(textOnShow);
    }

    @FXML
    public void fMultiply(ActionEvent e) {
        setSign();
        if(oneNumberNeeded)
        {
            oneNumberNeeded=false;
            calculateOne();
        }
        if(!lastWasNum)
            error();
        lastWasNum=false;
        if(!signs.equals("+"))
            calculate();
        signs="x";
        textOnShow = textOnShow + "x";
        show.setText(textOnShow);
    }

    @FXML
    public void fCot(ActionEvent e) {
        setSign();
        oneNumberNeeded=true;
        if(lastWasNum)
            error();
        signs="cot";
        textOnShow = textOnShow + "cot";
        show.setText(textOnShow);
    }

    @FXML
    public void fAc(ActionEvent e) {
        setSign();
        textOnShow = "";
        show.setText(textOnShow);
        nums.clear();
        signs="+";
        lastWasNum = false;
        oneNumberNeeded=false;
    }

    @FXML
    public void fLn(ActionEvent e) {
        setSign();
        oneNumberNeeded=true;
        if(lastWasNum)
            error();
        signs="ln";
        textOnShow = textOnShow + "ln";
        show.setText(textOnShow);
    }
    public void error()
    {
        show.setText("Error");
        textOnShow="";
        nums.clear();
        lastWasNum = false;
        oneNumberNeeded=false;
        signs="+";
    }
    private void calculate() {
        double a=Double.parseDouble(nums.get(nums.size()-1)),b=Double.parseDouble(nums.get(nums.size()-2));
        nums.remove(nums.get(nums.size()-1));
        nums.remove(nums.get(nums.size()-1));
        switch (signs)
        {
            case "x":
                nums.add(String.valueOf(a*b));
                break;
            case "÷":
                nums.add(String.valueOf(b/a));
                break;
            case "^":
                nums.add(String.valueOf(Math.pow(b,a)));
                break;
            case "-":
                nums.add(String.valueOf(b-a));
                break;
        }
    }
    public void calculateOne() {
        double a=Double.parseDouble(nums.get(nums.size()-1));
        nums.remove(nums.get(nums.size()-1));
        switch (signs)
        {
            case "sin":
                nums.add(String.valueOf(Math.sin(a)));
                break;
            case "cos":
                nums.add(String.valueOf(Math.cos(a)));
                break;
            case "tan":
                nums.add(String.valueOf(Math.tan(a)));
                break;
            case "cot":
                nums.add(String.valueOf(1/Math.tan(a)));
                break;
            case "√":
                nums.add(String.valueOf(Math.sqrt(a)));
                break;
            case "ln":
                nums.add(String.valueOf(Math.log(a)));
                break;
            case "Log":
                nums.add(String.valueOf(Math.log10(a)));
                break;
        }
    }
    private void calculateAnswer() {
        double ans=0;
        textOnShow="";
        for (int i=0;i<nums.size();i++)
        {
            System.out.println(Double.parseDouble(nums.get(i)));
            ans+=Double.parseDouble(nums.get(i));
            textOnShow=textOnShow+" "+nums.get(i);
        }
        show.setText("="+ans);
        textOnShow="";
        lastWasNum = false;
        oneNumberNeeded=false;
    }

    public void setSign() {
        String temp=String.valueOf(numSign*(Double.parseDouble(nums.get(nums.size()-1))));
        nums.remove(nums.size()-1);
        nums.add(temp);
        numSign=1;
    }
}
