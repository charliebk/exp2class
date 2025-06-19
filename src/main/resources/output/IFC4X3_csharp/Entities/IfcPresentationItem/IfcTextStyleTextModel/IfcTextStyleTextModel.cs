public class IfcTextStyleTextModel : IfcPresentationItem
{
    public IfcSizeSelect TextIndent { get; set; }
    public IfcTextAlignment TextAlign { get; set; }
    public IfcTextDecoration TextDecoration { get; set; }
    public IfcSizeSelect LetterSpacing { get; set; }
    public IfcSizeSelect WordSpacing { get; set; }
    public IfcTextTransformation TextTransform { get; set; }
    public IfcSizeSelect LineHeight { get; set; }
}
