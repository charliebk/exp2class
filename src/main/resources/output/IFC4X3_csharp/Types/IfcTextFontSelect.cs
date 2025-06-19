// SELECT TYPE IfcTextFontSelect
public class IfcTextFontSelect {
    public object Value { get; }

    public IfcTextFontSelect(object value) {
        if (!(value is IfcExternallyDefinedTextFont || value is IfcPreDefinedTextFont))
        {
            throw new ArgumentException("Value must be one of: IfcExternallyDefinedTextFont, IfcPreDefinedTextFont");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
