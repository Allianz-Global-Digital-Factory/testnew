package testnew.vehicle.service;

import testnew.api.model.DataOptionList;
import testnew.vehicle.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService {

  private final VehicleRepository vehicleRepository;


  @Override
  public DataOptionList vehicleBrands() {
    return vehicleRepository.vehicleBrands();
  }

}
