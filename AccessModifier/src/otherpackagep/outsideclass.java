package otherpackagep;

import packageone.callingaccesSpecifer;

public class outsideclass extends callingaccesSpecifer {
 public static void main(String[] args) {
	callingaccesSpecifer obj = new callingaccesSpecifer();
	obj.method();
}
}
