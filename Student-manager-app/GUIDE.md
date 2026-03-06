# CSS Keyframe Animations Guide

## Overview
This project demonstrates 10 different CSS keyframe animations for images. Keyframes allow you to animate CSS properties smoothly over time.

## Animation Properties Explained

### Basic Animation Syntax
```css
@keyframes animationName {
    from { /* starting state */ }
    to { /* ending state */ }
}

selector {
    animation: animationName duration timing-function iteration-count;
}
```

---

## 1. Fade In Animation
**Effect:** Image gradually becomes visible (opacity changes from 0 to 1)

**CSS:**
```css
@keyframes fadeIn {
    from {
        opacity: 0;
    }
    to {
        opacity: 1;
    }
}

.animate-fade-in {
    animation: fadeIn 2s ease-in-out infinite;
}
```

**Use Cases:** Entrance effects, loading states, smooth transitions

---

## 2. Slide In Animation
**Effect:** Image slides in from the left while fading in

**CSS:**
```css
@keyframes slideIn {
    from {
        transform: translateX(-100px);
        opacity: 0;
    }
    to {
        transform: translateX(0);
        opacity: 1;
    }
}

.animate-slide-in {
    animation: slideIn 2s ease-in-out infinite;
}
```

**Properties Used:**
- `translateX()` - moves element horizontally
- `opacity` - controls transparency

---

## 3. Rotate Animation
**Effect:** Image rotates continuously 360 degrees

**CSS:**
```css
@keyframes rotate {
    from {
        transform: rotate(0deg);
    }
    to {
        transform: rotate(360deg);
    }
}

.animate-rotate {
    animation: rotate 3s linear infinite;
}
```

**Timing Function:** `linear` - maintains constant speed throughout

---

## 4. Scale/Zoom Animation
**Effect:** Image grows and shrinks (zooms in and out)

**CSS:**
```css
@keyframes scale {
    0% {
        transform: scale(1);
    }
    50% {
        transform: scale(1.2);
    }
    100% {
        transform: scale(1);
    }
}

.animate-scale {
    animation: scale 2s ease-in-out infinite;
}
```

**Percentage Keyframes:**
- `0%` - starting state
- `50%` - middle state
- `100%` - ending state

---

## 5. Bounce Animation
**Effect:** Image moves up and down in a bouncing motion

**CSS:**
```css
@keyframes bounce {
    0%, 100% {
        transform: translateY(0);
    }
    50% {
        transform: translateY(-30px);
    }
}

.animate-bounce {
    animation: bounce 1.5s ease-in-out infinite;
}
```

---

## 6. Pulse Animation
**Effect:** Image creates a pulsing glow effect using box-shadow

**CSS:**
```css
@keyframes pulse {
    0%, 100% {
        box-shadow: 0 0 0 0 rgba(102, 126, 234, 0.7);
    }
    50% {
        box-shadow: 0 0 0 15px rgba(102, 126, 234, 0);
    }
}

.animate-pulse {
    animation: pulse 2s infinite;
}
```

**Note:** Uses RGBA color with alpha channel for fading glow

---

## 7. Swing Animation
**Effect:** Image swings back and forth like a pendulum

**CSS:**
```css
@keyframes swing {
    20% { transform: rotate(15deg); }
    40% { transform: rotate(-10deg); }
    60% { transform: rotate(5deg); }
    80% { transform: rotate(-5deg); }
    100% { transform: rotate(0deg); }
}

.animate-swing {
    animation: swing 2s ease-in-out infinite;
    transform-origin: top center;
}
```

**Property:** `transform-origin` sets the pivot point for rotation

---

## 8. Flash Animation
**Effect:** Image flashes on and off

**CSS:**
```css
@keyframes flash {
    0%, 50%, 100% {
        opacity: 1;
    }
    25%, 75% {
        opacity: 0.3;
    }
}

.animate-flash {
    animation: flash 1.5s ease-in-out infinite;
}
```

---

## 9. Complex Animation (Multi-Effect)
**Effect:** Combines multiple transforms (translate, rotate, scale) with opacity changes

**CSS:**
```css
@keyframes complexAnimation {
    0% {
        transform: translate(0, 0) rotate(0deg) scale(1);
        opacity: 1;
    }
    25% {
        transform: translate(50px, -50px) rotate(90deg) scale(1.1);
    }
    50% {
        transform: translate(0, -100px) rotate(180deg) scale(1.2);
        opacity: 0.8;
    }
    75% {
        transform: translate(-50px, -50px) rotate(270deg) scale(1.1);
    }
    100% {
        transform: translate(0, 0) rotate(360deg) scale(1);
        opacity: 1;
    }
}

.animate-complex {
    animation: complexAnimation 4s ease-in-out infinite;
}
```

---

## 10. Hover Animation
**Effect:** Animation triggers on mouse hover

**CSS:**
```css
@keyframes hoverFloat {
    0%, 100% {
        transform: translateY(0px);
    }
    50% {
        transform: translateY(-20px);
    }
}

.animate-hover {
    transition: all 0.3s ease;
}

.animate-hover:hover {
    animation: hoverFloat 1s ease-in-out;
    filter: drop-shadow(0 10px 20px rgba(0, 0, 0, 0.3));
}
```

---

## Animation Properties Reference

### Duration
- `animation-duration` - How long the animation takes (e.g., `2s`)

### Timing Functions
- `linear` - Constant speed
- `ease` - Slow start and end (default)
- `ease-in` - Slow start
- `ease-out` - Slow end
- `ease-in-out` - Slow start and end
- `cubic-bezier()` - Custom timing

### Iteration Count
- `1` - Play once
- `infinite` - Loop forever
- `2`, `3`, etc. - Specific number of repetitions

### Direction
- `normal` - Forward then back to start
- `reverse` - Backward then to end
- `alternate` - Forward then backward
- `alternate-reverse` - Backward then forward

### Fill Mode
- `none` - Default behavior
- `forwards` - Keeps final state
- `backwards` - Keeps initial state
- `both` - Applies both directions

---

## Transform Functions

### Translate
- `translateX(50px)` - Move horizontally
- `translateY(50px)` - Move vertically
- `translate(50px, 50px)` - Move in both directions

### Rotate
- `rotate(45deg)` - Rotate element

### Scale
- `scale(1.5)` - Scale uniformly
- `scaleX(2)` - Scale horizontally
- `scaleY(0.5)` - Scale vertically

### Skew
- `skew(10deg, 20deg)` - Skew element

---

## Best Practices

1. **Performance:** Use `transform` and `opacity` for smooth animations
2. **Accessibility:** Respect `prefers-reduced-motion` for users who prefer no animations
3. **Duration:** Keep animations between 0.2s and 3s for optimal UX
4. **Clarity:** Use appropriate timing functions for natural motion

### Example - Respecting User Preferences
```css
@media (prefers-reduced-motion: reduce) {
    * {
        animation-duration: 0.01ms !important;
        animation-iteration-count: 1 !important;
    }
}
```

---

## Browser Support
CSS Keyframes are supported in all modern browsers (Chrome, Firefox, Safari, Edge).

For older browsers, use vendor prefixes:
```css
@-webkit-keyframes fadeIn { ... }
@keyframes fadeIn { ... }

animation: -webkit-fadeIn 2s ease-in-out;
animation: fadeIn 2s ease-in-out;
```

---

## Running the Project
1. Open `index.html` in a web browser
2. Watch the various animations in action
3. Modify the CSS properties to create your own animations
4. Use the hover animation as a template for interactive effects
