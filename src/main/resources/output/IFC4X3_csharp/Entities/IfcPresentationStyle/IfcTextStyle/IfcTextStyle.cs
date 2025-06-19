public class IfcTextStyle : IfcPresentationStyle
{
    public IfcTextStyleForDefinedFont TextCharacterAppearance { get; set; }
    public IfcTextStyleTextModel TextStyle { get; set; }
    public IfcTextFontSelect TextFontStyle { get; set; }
    public IfcBoolean ModelOrDraughting { get; set; }
}
