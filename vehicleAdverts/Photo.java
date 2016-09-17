package vehicleAdverts;

import exceptions.AdvertException;
import exceptions.PhotoException;

public class Photo {
	private static final int MIN_CHARS_FOR_VALID_SITE = 3;
	private int id;
	private int advert_id;
	private String url;

	protected Photo(int id, int advert_id, String url) throws PhotoException, AdvertException {
		if (id > 0) {
			this.id = id;
		} else {
			throw new PhotoException("Incorrect id");
		}
		if (advert_id > 0) {
			this.advert_id = advert_id;
		} else {
			throw new AdvertException("Incorrect advert id");
		}
		if (url != null && url.trim().length() > MIN_CHARS_FOR_VALID_SITE) {
			this.url = url;
		}
	}

	public int getId() {
		return id;
	}

	public int getAdvert_id() {
		return advert_id;
	}

	public String getUrl() {
		return url;
	}

}
