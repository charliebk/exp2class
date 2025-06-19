public class IfcFacetedBrepWithVoids : IfcFacetedBrep
{
    public SET [1:?] OF IfcClosedShell Voids { get; set; }
}
