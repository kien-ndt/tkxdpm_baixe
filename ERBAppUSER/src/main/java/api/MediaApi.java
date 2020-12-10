package api;

import rentBike.RentBikeEntity;

public class MediaApi {

        public RentBikeEntity getRentBike(String idBike){

            RentBikeEntity rentBikeEntity = new RentBikeEntity();
            // Gọi api lấy xe
            if (idBike.equals("1")){
                rentBikeEntity.setId(1);
                rentBikeEntity.setType("Xe đạp đôi");
                rentBikeEntity.setDeposit("700000");
                rentBikeEntity.setIdStation(1);
            }
            return rentBikeEntity;
        }

}
