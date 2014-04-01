package web;

import org.footoo.web.form.FormAttribute;
import org.footoo.web.form.FormFieldEnum;
import org.footoo.web.user.LoginForm;

class LoginForm2 extends LoginForm {
    @FormAttribute(required = true, type = { FormFieldEnum.HEX_NUMBER_FIELD })
    private int    age;
    @FormAttribute(required = false, type = { FormFieldEnum.HEX_NUMBER_FIELD })
    private String school;

    /**
     * Getter method for property <tt>age</tt>.
     * 
     * @return property value of age
     */
    public final int getAge() {
        return age;
    }

    /**
     * Setter method for property <tt>age</tt>.
     * 
     * @param age value to be assigned to property age
     */
    public final void setAge(int age) {
        this.age = age;
    }

    /**
     * Getter method for property <tt>school</tt>.
     * 
     * @return property value of school
     */
    public final String getSchool() {
        return school;
    }

    /**
     * Setter method for property <tt>school</tt>.
     * 
     * @param school value to be assigned to property school
     */
    public final void setSchool(String school) {
        this.school = school;
    }

}