public class IfcRelCoversSpaces extends IfcRelConnects {
    public IfcSpace RelatingSpace;
    public SET [1:?] OF IfcCovering RelatedCoverings;
}
