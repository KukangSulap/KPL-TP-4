package com.barney.kpltp4;

import android.widget.TextView;

class HaloGeneric {

   TextView inputan;

   public HaloGeneric(TextView inputan) {
      this.inputan = inputan;
   }

   public void SapaUser(String x){
      inputan.setText("Halo user " + x);
   }
}
