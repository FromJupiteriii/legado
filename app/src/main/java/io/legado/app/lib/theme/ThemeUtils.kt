package io.legado.app.lib.theme

import android.content.Context
import androidx.annotation.AttrRes
import android.graphics.drawable.Drawable

/**
 * @author Aidan Follestad (afollestad)
 */
object ThemeUtils {

    @JvmOverloads
    fun resolveColor(context: Context, @AttrRes attr: Int, fallback: Int = 0): Int {
        val a = context.theme.obtainStyledAttributes(intArrayOf(attr))
        return try {
            a.getColor(0, fallback)
        } catch (e: Exception) {
            fallback
        } finally {
            a.recycle()
        }
    }

    @JvmOverloads
    fun resolveFloat(context: Context, @AttrRes attr: Int, fallback: Float = 0.0f): Float {
        val a = context.theme.obtainStyledAttributes(intArrayOf(attr))
        return try {
            a.getFloat(0, fallback)
        } catch (e: Exception) {
            fallback
        } finally {
            a.recycle()
        }
    }

    @JvmOverloads
    fun resolveDrawable(context: Context, @AttrRes attr: Int): Drawable? {
        val a = context.theme.obtainStyledAttributes(intArrayOf(attr))
        return try {
            a.getDrawable(0)
        } finally {
            a.recycle()
        }
    }
}