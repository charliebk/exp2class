public class IfcSurfaceStyleRendering : IfcSurfaceStyleShading
{
    public IfcColourOrFactor DiffuseColour { get; set; }
    public IfcColourOrFactor TransmissionColour { get; set; }
    public IfcColourOrFactor DiffuseTransmissionColour { get; set; }
    public IfcColourOrFactor ReflectionColour { get; set; }
    public IfcColourOrFactor SpecularColour { get; set; }
    public IfcSpecularHighlightSelect SpecularHighlight { get; set; }
    public IfcReflectanceMethodEnum ReflectanceMethod { get; set; }
}
