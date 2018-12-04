package véhicule;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class PhotoVehicule {
	@Column
	private String img;
	
	public PhotoVehicule() {}
	
	public PhotoVehicule(String p) {
		this.img = p;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
}
