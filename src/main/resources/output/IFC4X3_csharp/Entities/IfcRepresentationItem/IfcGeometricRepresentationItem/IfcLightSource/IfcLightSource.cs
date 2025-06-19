public class IfcLightSource : IfcGeometricRepresentationItem
{
    public IfcLabel Name { get; set; }
    public IfcColourRgb LightColour { get; set; }
    public IfcNormalisedRatioMeasure AmbientIntensity { get; set; }
    public IfcNormalisedRatioMeasure Intensity { get; set; }

    // === EXTENDED BY ===
    // IfcLightSourceAmbient
    // IfcLightSourceDirectional
    // IfcLightSourceGoniometric
    // IfcLightSourcePositional
}
