
public class Converter {
 private double conversion;
 public Converter(double a_conversionFactor)
 {
  a_conversionFactor = conversion;
 }
 
 public double convertTo(double fromMeasurement)
 {
  fromMeasurement = fromMeasurement * conversion;
  return fromMeasurement;
  
 }
 
 public double convertFrom(double to )
 {
  
  return to/conversion;
  
 }
}
