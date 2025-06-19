public class IfcIndexedColourMap : IfcPresentationItem
{
    public IfcTessellatedFaceSet MappedTo { get; set; }
    public IfcNormalisedRatioMeasure Opacity { get; set; }
    public IfcColourRgbList Colours { get; set; }
    public List<IfcPositiveInteger> ColourIndex { get; set; }
}
