public class IfcSite : IfcSpatialStructureElement
{
    public IfcCompoundPlaneAngleMeasure RefLatitude { get; set; }
    public IfcCompoundPlaneAngleMeasure RefLongitude { get; set; }
    public IfcLengthMeasure RefElevation { get; set; }
    public IfcLabel LandTitleNumber { get; set; }
    public IfcPostalAddress SiteAddress { get; set; }
}
