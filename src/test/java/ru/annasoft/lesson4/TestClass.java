package ru.annasoft.lesson4;

public class TestClass {

    public String field1 = "wqefcwcerwecwe";
    public Integer field2 = 50;
    public Float field3 = 123F;
    public Boolean field4 = true;
    public int field5 = 123;
    public float field6 = 2334.0F;
    public boolean field7 = true;

    public String getField1() {
        return field1;
    }

    public Integer getField2() {
        return field2;
    }

    public Float getField3() {
        return field3;
    }

    public Boolean getField4() {
        return field4;
    }

    public int getField5() {
        return field5;
    }

    public float getField6() {
        return field6;
    }

    public boolean isField7() {
        return field7;
    }

    @Override
    public String toString() {
        return "TestClass {" +
                "field1='" + this.field1 + '\'' +
                ", field2=" + this.field2 +
                ", field3=" + this.field3 +
                ", field4=" + this.field4 +
                ", field5=" + this.field5 +
                ", field6=" + this.field6 +
                ", field7=" + this.field7 +
                '}';
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public void setField2(Integer field2) {
        this.field2 = field2;
    }

    public void setField3(Float field3) {
        this.field3 = field3;
    }

    public void setField4(Boolean field4) {
        this.field4 = field4;
    }

    public void setField5(int field5) {
        this.field5 = field5;
    }

    public void setField6(float field6) {
        this.field6 = field6;
    }

    public void setField7(boolean field7) {
        this.field7 = field7;
    }
}
