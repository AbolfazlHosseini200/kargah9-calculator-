package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.event.ActionEvent;

import java.util.ArrayList;

/**
 * Thecontroller part of program.
 */
public class Controller {
    /**
     * The Text on show.
     */
    public String textOnShow = "";
    /**
     * The Nums.
     */
    public ArrayList<String> nums = new ArrayList<String>();
    /**
     * The Signs.
     */
    public String signs = "+";
    /**
     * The Num sign.
     */
    public double numSign=1;
    /**
     * The Last was num.
     */
    public boolean lastWasNum = false, /**
     * The One number needed.
     */
    oneNumberNeeded=false;
    /**
     * The Show.
     */
    @FXML
    public TextArea show;

    /**
     * The One.
     */
    @FXML
    public Button one;

    /**
     * The Log.
     */
    @FXML
    public Button log;


    /**
     * The Two.
     */
    @FXML
    public Button two;
    /**
     * The Three.
     */
    @FXML
    public Button three;
    /**
     * The Four.
     */
    @FXML
    public Button four;
    /**
     * The Five.
     */
    @FXML
    public Button five;
    /**
     * The Six.
     */
    @FXML
    public Button six;
    /**
     * The Seven.
     */
    @FXML
    public Button seven;
    /**
     * The Eight.
     */
    @FXML
    public Button eight;
    /**
     * The Nine.
     */
    @FXML
    public Button nine;
    /**
     * The Zero.
     */
    @FXML
    public Button zero;
    /**
     * The Division.
     */
    @FXML
    public Button division;
    /**
     * The Multiply.
     */
    @FXML
    public Button multiply;
    /**
     * The Minus.
     */
    @FXML
    public Button minus;
    /**
     * The Sum.
     */
    @FXML
    public Button sum;
    /**
     * The Radical.
     */
    @FXML
    public Button radical;
    /**
     * The Equal.
     */
    @FXML
    public Button equal;
    /**
     * The Tan.
     */
    @FXML
    public Button tan;
    /**
     * The Sin.
     */
    @FXML
    public Button sin;
    /**
     * The Cos.
     */
    @FXML
    public Button cos;
    /**
     * The Cot.
     */
    @FXML
    public Button cot;
    /**
     * The Power.
     */
    @FXML
    public Button power;
    /**
     * The Sign.
     */
    @FXML
    public Button sign;
    /**
     * The Dot.
     */
    @FXML
    public Button dot;
    /**
     * The Ac.
     */
    @FXML
    public Button ac;
    /**
     * The Ln.
     */
    @FXML
    public Button ln;


    /**
     * F 1.
     *
     * @param e the e
     */
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

    /**
     * F 2.
     *
     * @param e the e
     */
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

    /**
     * F 3.
     *
     * @param e the e
     */
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

    /**
     * F 4.
     *
     * @param e the e
     */
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

    /**
     * F 5.
     *
     * @param e the e
     */
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

    /**
     * F 6.
     *
     * @param e the e
     */
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

    /**
     * F 7.
     *
     * @param e the e
     */
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

    /**
     * F 8.
     *
     * @param e the e
     */
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

    /**
     * F 9.
     *
     * @param e the e
     */
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

    /**
     * F 0.
     *
     * @param e the e
     */
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

    /**
     * F sum.
     *
     * @param e the e
     */
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
        else{


        lastWasNum=false;
        if(!signs.equals("+"))
            calculate();
        signs="+";
        textOnShow = textOnShow + "+";
        show.setText(textOnShow);
    }}


    /**
     * F minus.
     *
     * @param e the e
     */
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
        else
        {
            if(!signs.equals("+"))
                calculate();
            lastWasNum=false;
            signs="-";
            textOnShow = textOnShow + "-";
            show.setText(textOnShow);
        }

    }

    /**
     * F equal.
     *
     * @param e the e
     */
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


    /**
     * F sign.
     *
     * @param e the e
     */
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

    /**
     * F radical.
     *
     * @param e the e
     */
    @FXML
    public void fRadical(ActionEvent e) {
        if(lastWasNum)
            error();
        else
        {
            oneNumberNeeded=true;
            signs="√";
            textOnShow = textOnShow + "√";
            show.setText(textOnShow);
        }
    }

    /**
     * F dot.
     *
     * @param e the e
     */
    @FXML
    public void fDot(ActionEvent e) {
        if(lastWasNum)
            if(nums.get(nums.size()-1).contains("."))
                error();
            else
            {
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

    }

    /**
     * F divide.
     *
     * @param e the e
     */
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
        else
        {
            if(!signs.equals("+"))
                calculate();
            lastWasNum=false;
            signs="÷";
            textOnShow = textOnShow + "÷";
            show.setText(textOnShow);
        }

    }

    /**
     * F tan.
     *
     * @param e the e
     */
    @FXML
    public void fTan(ActionEvent e) {
        setSign();
        oneNumberNeeded=true;
        if(lastWasNum)
            error();
        else
        {
            signs="tan";
            textOnShow = textOnShow + "tan";
            show.setText(textOnShow);
        }

    }

    /**
     * F sin.
     *
     * @param e the e
     */
    @FXML
    public void fSin(ActionEvent e) {
        setSign();
        oneNumberNeeded=true;
        if(lastWasNum)
            error();
        else
        {
            signs="sin";
            textOnShow = textOnShow + "sin";
            show.setText(textOnShow);
        }

    }

    /**
     * F cos.
     *
     * @param e the e
     */
    @FXML
    public void fCos(ActionEvent e) {
        setSign();
        oneNumberNeeded=true;
        if(lastWasNum)
            error();
        else
        {signs="cos";
            textOnShow = textOnShow + "cos";
            show.setText(textOnShow);

        }

    }

    /**
     * F log.
     *
     * @param e the e
     */
    @FXML
    public void fLog(ActionEvent e) {
        setSign();
        oneNumberNeeded=true;
        if(lastWasNum)
            error();
        else
        {
            signs="Log";
            textOnShow = textOnShow + "Log";
            show.setText(textOnShow);
        }

    }

    /**
     * F power.
     *
     * @param e the e
     */
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
        else
        {
            lastWasNum=false;
            if(!signs.equals("+"))
                calculate();
            signs="^";
            textOnShow = textOnShow + "^";
            show.setText(textOnShow);
        }

    }

    /**
     * F multiply.
     *
     * @param e the e
     */
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
        else
        {
            lastWasNum=false;
            if(!signs.equals("+"))
                calculate();
            signs="x";
            textOnShow = textOnShow + "x";
            show.setText(textOnShow);
        }

    }

    /**
     * F cot.
     *
     * @param e the e
     */
    @FXML
    public void fCot(ActionEvent e) {
        setSign();
        oneNumberNeeded=true;
        if(lastWasNum)
            error();
        else
        {
            signs="cot";
            textOnShow = textOnShow + "cot";
            show.setText(textOnShow);
        }

    }

    /**
     * F ac.
     *
     * @param e the e
     */
    @FXML
    public void fAc(ActionEvent e) {
        textOnShow = "";
        show.setText(textOnShow);
        nums.clear();
        signs="+";
        lastWasNum = false;
        oneNumberNeeded=false;
    }

    /**
     * F ln.
     *
     * @param e the e
     */
    @FXML
    public void fLn(ActionEvent e) {
        setSign();
        oneNumberNeeded=true;
        if(lastWasNum)
            error();
        else
        {
            signs="ln";
            textOnShow = textOnShow + "ln";
            show.setText(textOnShow);
        }

    }

    /**
     * Error.
     */
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

    /**
     * Calculate one.
     */
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

    /**
     * Sets sign.
     */
    public void setSign() {
        if(nums.size()!=0)
        {
            String temp=String.valueOf(numSign*(Double.parseDouble(nums.get(nums.size()-1))));
            nums.remove(nums.size()-1);
            nums.add(temp);
            numSign=1;
        }
    }
}
