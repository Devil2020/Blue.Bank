package com.expertapps.bluebank.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.expertapps.bluebank.R

// Set of Material typography styles to start with
val interFontFamily = FontFamily(
    Font(R.font.inter_black, weight = FontWeight.Black),
    Font(R.font.inter_bold, weight = FontWeight.Bold),
    Font(R.font.inter_extrabold, weight = FontWeight.ExtraBold),
    Font(R.font.inter_light, weight = FontWeight.Light),
    Font(R.font.inter_extralight, weight = FontWeight.ExtraLight),
    Font(R.font.inter_medium, weight = FontWeight.Medium),
    Font(R.font.inter_regular, weight = FontWeight.Normal),
    Font(R.font.inter_semibold, weight = FontWeight.SemiBold),
    Font(R.font.inter_thin, weight = FontWeight.Thin),
)

val Typography = Typography(

    /*Headlines are best-suited for short, high-emphasis text on smaller screens.
     These styles can be good for marking primary passages of text or important regions of content.
    Headlines can also make use of expressive typefaces,
    provided that appropriate line height and letter spacing is also integrated to maintain readability.

    ---------------------> Headline style used for short text on a small screen , Dialog using a headline style
    */

    headlineSmall = TextStyle(
        fontFamily = interFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = interFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = interFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),

    /*Titles are smaller than headline styles, and should be used for medium-emphasis text that remains relatively short.
    For example, consider using title styles to divide secondary passages of text or secondary regions of content.
    For titles, use caution when using expressive fonts, including display, handwritten, and script styles.

    ------------------> Top app bar using title style ,
    */

    titleSmall = TextStyle(
        fontFamily = interFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    titleMedium = TextStyle(
        fontFamily = interFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    titleLarge = TextStyle(
        fontFamily = interFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),

    /*
    Body styles are used for longer passages of text in your app.
    Use typefaces intended for body styles, which are readable at smaller sizes and can be comfortably read in longer passages.
    Avoid expressive or decorative fonts for body text because these can be harder to read at small sizes.

    ------------------> Body style used throughout an article about pesto , Example of body style used throughout a setup flow ( Button Layout )
    */

    bodySmall = TextStyle(
        fontFamily = interFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = interFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = interFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),

    /*Label styles are smaller, utilitarian styles, used for things like the text inside components or
     for very small text in the content body, such as captions. Buttons, for example, use the label large style.

     ----------------------> A navigation bar using label style for the destination text
     */

    labelSmall = TextStyle(
        fontFamily = interFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    labelMedium = TextStyle(
        fontFamily = interFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelLarge = TextStyle(
        fontFamily = interFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),

    /*There are three display styles in the default type scale: Large, medium, and small.
     As the largest text on the screen, display styles are reserved for short, important text or numerals.
     They work best on large screens. For display type, consider choosing a more expressive font,
     such as a handwritten or script style.
     If available, set the appropriate optical size to your usage.

     ------------> A card using a display size , An expressive typeface can entice readers to engage with an eye-catching design
     */
    displaySmall = TextStyle(
        fontFamily = interFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    displayMedium = TextStyle(
        fontFamily = interFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    displayLarge = TextStyle(
        fontFamily = interFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    )
)