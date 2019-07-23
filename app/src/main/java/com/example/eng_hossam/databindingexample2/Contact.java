package com.example.eng_hossam.databindingexample2;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class Contact extends BaseObservable {

    public String firstname, lastname;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
        notifyPropertyChanged(BR.firstname);
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
        notifyPropertyChanged(BR.lastname);

    }

    public Contact(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Bindable
    public String getFirstname() {
        return firstname;
    }

    @Bindable
    public String getLastname() {
        return lastname;
    }


}
